package client.api;

public class Card implements Comparable<Card>{
 int value;
 String type;
 
 public Card(int value,String type) {
  this.value=value;
  this.type=type;
 }
 
 public String getType() {
  return type;
 }
 public int getValue() {
  return value;
 }
 
 @Override
 public int compareTo(Card oCard) {
  int answer=0;
  if (this.value<oCard.value){
   answer=-1;
  }
  else if (this.value>oCard.value){
   answer=1;
  }
  
  return answer;
 }
 @Override
 public String toString() {
  
  return String.valueOf(value)+type;
 }
}