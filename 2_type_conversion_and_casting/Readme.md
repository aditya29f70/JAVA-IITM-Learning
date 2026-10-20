## we can change a variable type if it is defined once

- we can do **casting** --> explicity converstion
- converting float to int explicitly , we lost decimal values

* note we can implecitly convert int to byte type but can't implicitly convert byte to int here we need casting
  eg we can do ;
  byte b= 127;
  int a = b ; // can be done bz byte can convert into int

but

int a= 27;
byte b= a; // can't bz we can't convert int to byte so we need to use casting
byte b= (byte) a // will work give you 27

- and note if a int value is out of range of byte(-127 t 127) then it return modular value of that number
  eg;
  int a= 256;
  byte b= (byte) a; //since 256 out of range so it will assign modular value (256% 255) ;; 256 (range -127 to 127)

## so implicit converstaion we can say -> automatical casting (or fixing a small box inside kind of big box)

## and explicit convertion -> casting

# Type promotion:

eg:
byte a= 30;
byte b= 30;

// if we want to do a \* b value couldn't be byte type bz value is going out of range so in situation we can do type promote

int result= a \* b;

## operators -> +, -, \*, /, %

## Relational operator/comparision operators -- >, <,>=,<=, ==, !=

## Logical operators -> **and**/**or** --> And(&&), Or (||), Not (!)
