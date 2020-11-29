// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Eight Source (Secondary Class)

package morleygassignment8;

public class LandTract {
  
  private double length;
  private double width;
  private double area;
  
  //The no-arg constructor for class "LandTract"
  public LandTract(){
    length = 0;
    width = 0;
    area = 0;
  }
  
  //The normal constructor to get length and width
  public LandTract(double lens, double wids){
    this.length = lens;
    this.width = wids;
  }
  
  //Mutator method to set the area to an object
  public void setArea(double alpha){
    this.area = alpha;
  }
  
  //Return method to calculate the area
  public static double findArea(double len,double wid){
    return len * wid;
  }
  
  //Boolean method to see if they're equal
  public boolean equals(LandTract land2){
    boolean truth;
    truth = area == (land2.area);
    return truth;
  }
  
  @Override
   public String toString(){
     String str = ("Length is " + length + ", width is " + width
             + ", and area is " + area + ".");
     return str;
   }
  
}
