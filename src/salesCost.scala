object salesCost extends App{
  val bookAmt = 60
  val price = 24.95
  val discount = 0.4

  def calShippingCost (copyAmt:Int):Double = {
    if(copyAmt<50) copyAmt*3.0
    else (3.0*50) + ((copyAmt-50)*0.75)
  }

  def coverPrice (copies:Int, cPrice:Double):Double = {
    copies*cPrice - copies*cPrice*discount
  }

  val sCost = calShippingCost(bookAmt)
  val totalCPrice = coverPrice(bookAmt,price)

  def totalCost (shipCost:Double, covCost:Double):Double = {
    shipCost + covCost
  }

  val total = totalCost(sCost,totalCPrice)

  println("Total wholesale cost for "+bookAmt+" books is "+total)
}