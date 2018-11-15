package colours;

public class Palette {
 
 //*
 public static Colour red() {
  return new SixteenBitColour("FF0000");
 }
 
 public static Colour green() {
  return new DoubleColour("00FF00");
 }
 
 public static Colour blue() {
  return new SixteenBitColour("0000FF");
 }
 
 public static Colour cyan() {
  return new DoubleColour("00FFFF");
 }
 
 public static Colour magenta() {
  return new SixteenBitColour("FF00FF");
 }
 
 public static Colour yellow() {
  return new DoubleColour("FFFF00");
 }
 
 public static Colour orange() {
  return new SixteenBitColour("FFB200");
 }
 
 public static Colour purple() {
  return new DoubleColour("B200FF");
 }
 
 public static Colour aqua() {
  return new SixteenBitColour("37FFB1");
 }
 
 public static Colour black() {
  return new DoubleColour("000000");
 }
 
 public static Colour white() {
  return new SixteenBitColour("FFFFFF");
 }
 
 public static Colour favourite() {
  return new DoubleColour("4500CC");
 }

}
