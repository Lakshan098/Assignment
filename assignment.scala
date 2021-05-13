object assignment extends App{
  //1st question
  def celciusToFahrunhite(x:Double)=x*1.8+32;
  println("The tempurature is 35C is equal to " + celciusToFahrunhite(35)+ "F");

  //2nd question
  def volOfSphere(r:Double)=(3.142857142857143*r*r*r*4)/3;
  println("Volume of a sphere with radius 5 is: "+ volOfSphere(5));

  //3rd question
  def wholeSalePrice(y:Int) = if (y>50) 24.95*100/60*y+(y-50)*0.75+50*3 else 24.95*100/60*y+y*3;
  println("Sale of 60 books: "+ wholeSalePrice(60));


}
