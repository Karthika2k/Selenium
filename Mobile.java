����   1 R  week2/assisgnments/Mobile  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lweek2/assisgnments/Mobile; makeCall (Ljava/lang/String;F)V	    java/lang/System   out Ljava/io/PrintStream;
    java/io/PrintStream   println (Ljava/lang/String;)V  java/lang/StringBuilder
  !   java/lang/String " # valueOf (F)Ljava/lang/String;
  %   '  grams
  ) * + append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  - . / toString ()Ljava/lang/String; mobileModel Ljava/lang/String; mobileWeight F sendMsg (ZI)V
  7  8 (Z)V
  :  ; (I)V isFullCharged Z 
mobileCost I main ([Ljava/lang/String;)V C This is my Mobile
  	 F Samsung Galaxy ZC}  
  I   ]w
  L 4 5 args [Ljava/lang/String; mob 
SourceFile Mobile.java !               /     *� �    
                           g     !� +� � � Y$� � $&� (� ,� �    
            	         !       ! 0 1    ! 2 3    4 5     U     � � 6� � 9�    
                            < =     > ?  	 @ A     d      � B� � Y� DL+EG� H+J� K�    
                         M N     O    P    Q