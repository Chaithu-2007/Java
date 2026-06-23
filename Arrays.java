// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Arrays {
   public Arrays() {
   }

   public static void main(String[] var0) {
      byte var1 = 20;
      double var2 = 1.674;
      String var4 = "Bhavana";
      String var5 = "AB";
      int[] var6 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] var7 = new int[5];
      int[] var8 = new int[5];
      int var9 = 0;
      int var10 = 0;

      for(int var11 = 0; var11 < var6.length; ++var11) {
         if (var6[var11] % 2 == 0) {
            var7[var9] = var6[var11];
            ++var9;
         } else {
            var8[var10] = var6[var11];
            ++var10;
         }
      }

      System.out.println(var4 + " is " + var1 + " years old.");
      System.out.println("Even numbers:");

      for(int var12 = 0; var12 < var9; ++var12) {
         System.out.print(var7[var12] + " ");
      }

      System.out.println();
      System.out.println("Odd numbers:");

      for(int var13 = 0; var13 < var10; ++var13) {
         System.out.print(var8[var13] + " ");
      }

   }
}