package com.zy.graphxtest

import org.apache.spark.graphx.{Edge, Graph}
import org.apache.spark.sql.SparkSession

/**
 * @author zy
 *
 */
object VertexEdgeLoader {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("vel").master("local[2]").getOrCreate()
    val users = spark.sparkContext.textFile("file:///i:/testdata/users.txt").
      map(line =>{
        val fields = line.split(",")
        (fields(0).toLong,User(fields(1),fields(2)))
      })

    val friends = spark.sparkContext.textFile("file:///i:/testdata/friends.txt").map(line=>{
      val fields = line.split(",")
      Edge(fields(0).toLong,fields(1).toLong,"friend")
    })

    val graph = Graph(users,friends)

    println(graph.vertices.collect())

  }
}

case class User(name:String,occupation:String)
