����   4 �  %projetoFuncionario/ProjetoFuncionario  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 'LprojetoFuncionario/ProjetoFuncionario; main ([Ljava/lang/String;)V  dados/Funcionario
  	  Digite o nome do funcionario: 
    javax/swing/JOptionPane   showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;
     setNome (Ljava/lang/String;)V   Digite o salario: 
 " $ # java/lang/Double % & parseDouble (Ljava/lang/String;)D
  ( ) * setSalarioMes (D)V , Digite a quantidade de filhos: 
 . 0 / java/lang/Integer 1 2 parseInt (Ljava/lang/String;)I
  4 5 6 setQtdFilhos (I)V 8 !Digite a porcentagem do aumento: 
 : < ; java/lang/Float = > 
parseFloat (Ljava/lang/String;)F
  @ A B setAumentoSalario (F)V D Dados do funcionario 
 F java/lang/StringBuilder
 H J I java/lang/String K  valueOf
 E M   O Nome: 
 E Q R S append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  U V W getNome ()Ljava/lang/String; Y 

 E [ \ W toString ^ 	Salario: 
  ` a b getSalarioMes ()D
 E d R e (D)Ljava/lang/StringBuilder; g Quantidade de Filhos: 
  i j k getQtdFilhos ()I
 E m R n (I)Ljava/lang/StringBuilder; p Aumento Salarial: 
  r s b calcAumSalario u INSS: 
  w x b calcINSS z IR: 
  | } b calcIR  IRPF: 
  � � b calcIRPF
  � � � showMessageDialog )(Ljava/awt/Component;Ljava/lang/Object;)V args [Ljava/lang/String; f1 Ldados/Funcionario; nome Ljava/lang/String; 
salarioMes D 	qtdFilhos I aumentoSalario F saida 
SourceFile ProjetoFuncionario.java !               /     *� �    
                    	      �    :� Y� L� M+,� � � !J+)� '+� � -6+� 37� � 98+� ?C:� EY� G� LN� P+� T� PX� P� Z:� EY� G� L]� P+� _� cX� P� Z:� EY� G� Lf� P+� h� lX� P� Z:� EY� G� Lo� P+� q� cX� P� Z:� EY� G� Lt� P+� v� cX� P� Z:� EY� G� Ly� P+� {� cX� P� Z:� EY� G� L~� P+� �� cX� P� Z:� ��    
   N    
         !  +  1  ;  A  E  g  �  �  �  �  3 9 !    H   : � �   2 � �  , � �   � �  + � �  ; � � �  E � � �   �    �