.class public HelloWorld
.super java/lang/Object

.method public static inserir(III[I)I
.limit locals 100
.limit stack 100

iload 2
istore 4
Loop4:
iload 4
iload 0
if_icmple OffLoop7
iload 4
ldc 1
isub
istore 4
aload_3
iload 4
aload_3
iload 4
ldc 1
isub
iaload
iastore
goto Loop4
OffLoop7:
aload_3
iload 0
iload 1
iastore
  getstatic java/lang/System/out Ljava/io/PrintStream;
aload_3
iload 0
iaload
  invokevirtual java/io/PrintStream/println(I)V

iload 2
ldc 1
iadd
ireturn
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack 100
  .limit locals 100
  
ldc 10
newarray int
astore_0
  getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
ldc 3
aload_0
invokestatic HelloWorld/inserir(IIII)I
  invokevirtual java/io/PrintStream/println(I)V


  return
  
.end method

