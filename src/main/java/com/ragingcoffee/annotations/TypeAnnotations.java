package com.ragingcoffee.annotations;

/*
 * import java.lang.annotation.*;  
 
@Target(ElementType.TYPE_USE) 
@interface TypeAnno { } 
 
@Target(ElementType.TYPE_USE) 
@interface NotZeroLen {  
}  
 
@Target( ElementType.TYPE_USE ) 
@interface Unique { } 
 
@Target(ElementType.TYPE_USE) 
@interface MaxLen {  
  int value(); 
}  
 
@Target(ElementType.TYPE_PARAMETER) 
@interface What {  
  String description();  
}  
 
@Target(ElementType.FIELD) 
@interface EmptyOK { } 
 
@Target(ElementType.METHOD) 
@interface Recommended { } 
 
public class TypeAnnotations<@What(description = "Generic data type") T> {  
 
  public @Unique TypeAnnotations() {}  
  
  @TypeAnno String str; 
 
  @EmptyOK String test; 
  
  public int f(@TypeAnno TypeAnnotations<T> this, int x) { 
    return 10; 
  }   
 
  public @TypeAnno Integer f2(int j, int k) { 
    return j+k; 
  } 
 
  public @Recommended Integer f3(String str) { 
    return str.length() / 2; 
  } 
 
  public void f4() throws @TypeAnno NullPointerException {} 
 
  String @MaxLen(10) [] @NotZeroLen [] w; 
 
  @TypeAnno Integer[] vec; 
 
  public static void myMeth(int i) {  
 
    TypeAnnotations<@TypeAnno Integer> ob =  new TypeAnnotations<@TypeAnno Integer>();  
 
    @Unique TypeAnnotations<Integer> ob2 = new @Unique TypeAnnotations<Integer>(); 
 
    Object x = Integer.valueOf(10); 
    Integer y; 
 
    y = (@TypeAnno Integer) x; 
  } 
  
  public static void main(String args[]) {  
    myMeth(10);  
  }  
 
  class SomeClass extends @TypeAnno TypeAnnotations<Boolean> {} 
}

 */