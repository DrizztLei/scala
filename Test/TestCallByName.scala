object TestCallByName
{

  def time() =
  {
    println("Getting time ")
    System.nanoTime
  }

  def delayed(func: => Long) =
  {
    println("Inner the function delayed ")
    println("parameter: " + func)
    // func
  }

  def printArgs(args:String*)
  {
    for(value <- args)
    {
      println(value)
    }
  }

  def defaultFunctionValue(a:Int = 1234, b:Int = 321354) =
  {
    println(a)
    println(b)
  }

  def main(args: Array[String])
  {
    delayed(time())
    printArgs("a", "b", "c")
    defaultFunctionValue()
  }
}
