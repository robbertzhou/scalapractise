一、扩展类  
使用extends关键字。和java一样，final修饰后不能被继承。  

二、重写方法  
重写一个非抽象方法必需使用override修饰符。  
override def toString = ""  
调用超类方法和java一样，都是super.method()  

三、类型检查和转换  
要测试某个对象是否属于某个给定的类，用isInstanceOf方法。
if(p.isInstanceOf[Employee]){}