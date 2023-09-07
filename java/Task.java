import java.io.IOException;

class Task{
    public static void main (String[] args){
        int x;
        try {
            x = System.in.read();
            System.out.println("code = " + x + " x = " + (char)x);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}





// import java.util.Scanner;

// class Task {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] str = sc.nextLine().split(" ");
//         for(String el: str){
//             int count = 0;
//             for(int i = 0; i < str.length; i++){
//                 if(str[i].equals(el)){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 System.out.print(el + " ");
//             }
//         }
//     }
// }



// import java.util.Scanner;

// class Task {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       Integer n = Integer.parseInt(sc.nextLine());
//       String [] arr = sc.nextLine().split(" ");
//       if (n < 0 || n > arr.length - 1){
//        System.out.println("Неверный ввод");
//       }else{
//         System.out.println(arr[n]);
//         }  
//     }
// }







// import java.util.Scanner;

// class Task {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] arr = sc.nextLine().split(" ");
//         int m = arr.length;
//         String[] s = new String[m];
//         while (sc.hasNext()) {
//             s = sc.nextLine().split(" ");
//             for (int i = 0; i < m; i++) {
//                 arr[i] = s[i] + " " + arr[i];
//             }
//         }
//         for (String a: arr) {
//             System.out.println(a);
//         }
//     }
// }



// import java.util.Scanner;

// class Task{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = 0;
//         while(sc.hasNextInt()){
//             String[] arr = sc.nextLine().split(" ");
//             System.out.print(arr[n] + " ");
//             if(n < arr.length-1){
//                 n++;
//             }
//             else{
//                 break;
//             }
//         }
//     }
// }






// import java.util.Scanner;

// class Task{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int m = 0, n = 0;
//         while(sc.hasNext()){
//             String[] arr = sc.nextLine().split(" ");
//             n = arr.length;
//             m ++;
//         }
//         System.out.println("Строк: " + m);
//         System.out.println("Столбцов: " + n);
//     }
// }






// import java.util.Arrays;
// import java.util.Scanner;

// class Task{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String arr = sc.nextLine();
//         int n = Integer.parseInt(arr);
//         for(int i = 0; i < n; i++){
//             String[] wrd = sc.nextLine().split(" ");
//             System.out.println(Arrays.toString(wrd));
//         }
//     }
// }





// import java.util.Scanner;

// class Task{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), m = sc.nextInt(), i, j, res = 0;
//         int[][] arr = new int[n][m];
//         for(i = 1; i <= n; i++){
//             for(j = 1; j <= m; j++){
//                 res = i*j;
//                 System.out.print(res + (j < m ? " " : ""));
//             }
//             System.out.println();
//         }

//     }
// }






// import java.util.Arrays;
// import java.util.Scanner;

// class Task{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String[] arr = sc.nextLine().split(" ");
//         int[] num = new int[arr.length];
//         int i, sum = 0, j;
//         int min = Integer.MAX_VALUE;
//         for(i = 0; i < arr.length; i++){
//             num[i] = Integer.parseInt(arr[i]);
//         }
//         for(j = 0; j < num.length-2; j++){
//             sum = num[j] + num[j+2];
//             if(sum < min){
//                 min = sum;
//             }
//         }
//         System.out.println(sum);
//     }
// }




// import java.util.Arrays;
// import java.util.Scanner;

// class Task {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String [] arr = sc.nextLine().split(" ");
//         int lng = arr[0].length(), i, j;        
//         for (i = 0; i < arr.length; i++){
//             if(arr[i].length() < lng ) {
//                 lng = arr[i].length();
//           }
//         }
//         for(j = 0; j < arr.length; j++){
//             if (arr[j].length() == lng) {
//                 System.out.println(j + 1);
//                 break;
//             }
//         }
//     }
// }









// import java.util.Arrays;
// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String[] arr = str.split(" ");
// System.out.print(arr[0] + " ");
// int i;
// for(i = 1; i < arr.length-2; i+=2){
// System.out.print(arr[i+1] + " " + arr[i] + " ");
// }
// if(arr.length % 2 == 0){
// System.out.print(arr[arr.length-1]);
// }
// else{
// System.out.print(arr[arr.length-2] + " " + arr[arr.length-1]);
// }
// }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String n = sc.nextLine();
// String[] arr = n.split(" ");
// int[] num = new int[arr.length];
// int i;
// for(i = 0; i < arr.length; i++){
// num[i] = Integer.parseInt(arr[i]);
// }
// Arrays.sort(num);
// System.out.println(Arrays.toString(num));
// }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), i, res;
// int[] arr = new int[n];
// for (i = 0; i < n; i++){
// arr[i] = sc.nextInt();
// }
// int k = sc.nextInt();
// if(k >= 0){
// if(k < arr.length || k == arr.length){
// Arrays.sort(arr);
// res = arr[k-1];
// System.out.println(res);
// }
// else{
// System.out.println("Ошибка ввода");
// }
// }
// else{
// System.out.println("Ошибка ввода");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String[] num = str.split(",");
// for(String number: num){
// System.out.println(number);
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), i;
// int[] arr = new int[n];
// for(i = 0; i < n; i++){
// arr[i] = sc.nextInt();
// if(i > 0 && arr[i] > arr[i-1]){
// System.out.print(arr[i] + " ");
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), sum = 0, i;
// int[] arr = new int[n + 1];
// for(i = 2; i <= n; i += 2){
// arr[i] = i;
// sum = sum + arr[i];
// System.out.print(arr[i] + " ");
// }
// System.out.println("\n" + sum);
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), i;
// int[] arr = new int[n];
// for(i = 0; i < n ; i++){
// arr[i] = sc.nextInt();
// }
// int id = sc.nextInt();
// System.out.println(arr[id]);
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), i;
// int[] arr = new int[n];
// for(i = 0; i < n; i++){
// arr[i] = sc.nextInt();
// }
// System.out.print(arr[i-1]);
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] num = new int[n];
// for (int i = 1; i <= num.length; i++){
// num[i-1] = i;
// System.out.print(num[i-1] + " ");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int n = new Scanner(System.in).nextInt(), i, m = 0;
// if (n == 1){
// System.out.println("false");
// } else{
// for( i=1; i<=n; i++ ){
// int n1 = n%i;
// if ( n1==0 ){
// m++;
// }
// }
// if (m == 2){
// System.out.println("true");
// } else{
// System.out.println("false");
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int a = Math.abs(new Scanner(System.in).nextInt()), i;
// for(i = 1; i <= a; i++){
// if(a % i == 0){
// System.out.print(i + " ");
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), x = a, y = b;
// if(a > b){
// x = b;
// y = a;
// }
// int i = x;
// while(i >= x && i <= y){
// if(i % 2 != 0){
// System.out.print(i + " ");
// }
// i++;
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = Math.abs(sc.nextInt()), max = 0, i;
// String str = Integer.toString(n);
// int x = str.length();
// for(i = 1; i <= x; x++){
// int c = n % 10;
// n = n/10;
// max = Math.max(max, c);
// }
// System.out.println(max);
// }
// }

// class Task{
// public static void main(String[] args){
// for(int i = 1; i <= 5; i++){
// System.out.println(i);
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// double a = sc.nextDouble(), b = sc.nextDouble(), c = Math.sqrt(Math.pow(a, 2)
// + Math.pow(b, 2));
// System.out.println(Math.ceil(Math.round(c + a + b)));
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// Double x = sc.nextDouble(), y = sc.nextDouble(), n = sc.nextDouble(), a =
// Math.pow(x, y), smth = Math.pow(a,(1.0/n)), lngth = Math.pow(10 , 5);
// System.out.println(Math.round(smth * lngth)/lngth);
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int n = new Scanner(System.in).nextInt();
// double scale = Math.pow(10, n), p = Math.PI;
// System.out.println((n == 0) ? "3" : (Math.round(p * scale)/scale));
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// double x = new Scanner(System.in).nextDouble();
// System.out.println(Math.sin(Math.toRadians(x)) +
// Math.cos(Math.toRadians(x)));

// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// System.out.println(Math.toRadians(new Scanner(System.in).nextDouble()));
// }
// }

// class Task{
// public static void main(String[] args){
// System.out.println((Math.pow(Math.E, Math.PI) > Math.pow(Math.PI, Math.E)) ?
// ">" : (Math.pow(Math.E, Math.PI) < Math.pow(Math.PI, Math.E)) ? "<" : "=");
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// double x = sc.nextDouble(), y = sc.nextDouble();
// System.out.println(Math.pow(x, y));
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int n = new Scanner(System.in).nextInt(), i, j, a;
// for(i = 1; i <= n; i++){
// int m = 1;
// for(j = 1; j <= i; j++){
// for(a = 1; a <= j; a++){
// if(m <= i){
// System.out.print(j);
// }
// if(m < i){
// System.out.print(" ");
// }
// m++;
// }
// }
// if(i < n){
// System.out.println("");
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int n = new Scanner(System.in).nextInt(), i, j, m=0;
// for(i = 1; i <= n ; i++){
// for(j = 1; j <= i ; j++){
// m++;
// if(m > n){
// break;
// }
// System.out.print(i + " ");
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// int a = new Scanner(System.in).nextInt(), i, j;
// for(i = 1; i <= a; i++){
// for(j = 1; j<=i; j++){
// if (j == 1){
// System.out.print(j);
// } else{
// System.out.print(" " + j);
// }
// }
// System.out.println();
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n;
// while(sc.hasNext()){
// n = sc.nextInt();
// System.out.println(n*n + " " + n*n*n + " " + n*n*n*n + " " + n*n*n*n*n);
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), i, j;
// for(i = 1; i <= a; i++){
// for(j = 1; j<= b; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), i;
// for(i = 1; i <= b; i ++){
// System.out.print(a + " ");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), i;
// if (a >= 6){
// for(i =1; i <= a; i++){
// if(i % 2 == 0 && i % 3 == 0){
// System.out.print(i + " ");
// }
// }
// } else{
// System.out.println("Таких чисел нет");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str1 = sc.next();
// String str2 = sc.next();
// char ch1 = str1.charAt(0);
// char ch2 = str2.charAt(0);
// String n;
// while (sc.hasNext()) {
// n = sc.next();
// char m = n.charAt(0);
// if (ch1 >= m && ch2 <= m || ch1 <= m && ch2 >= m) {
// System.out.println(n);
// }
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int lngth = str.length() - 1;
// while(lngth >= 0){
// System.out.print(str.charAt(lngth));
// lngth --;
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int lngth = str.length() - 1;
// do {
// System.out.println(str.charAt(lngth));
// lngth --;
// } while(lngth >= 0);
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// double r = 0, sum = 0, count = 0, mid = 0;
// while(sc.hasNext() == true){
// r = sc.nextDouble();
// count ++;
// if(r <=10 && r >=0){
// sum += r;
// mid = sum / count;
// } else{
// break;
// }
// }
// System.out.println(mid);
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 0, sum = 0, count = 0;
// while ((n = sc.nextInt()) % 11 == 0) {
// count ++;
// if(n % 3 == 0){
// sum += n;
// }
// }
// System.out.println(count + "\n" + sum);
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int sum = 0;
// while(sc.hasNext() == true){
// String str =sc.next();
// sum ++;
// }
// System.out.println(sum);
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 1;
// int sum = 0;
// while (n > 0) {
// n = sc.nextInt();
// sum = sum + n;
// }
// System.out.println(sum);
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args){
// int x = new Scanner(System.in).nextInt(), y = 0;
// while(x > y){
// y ++;
// System.out.println(y);
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// String lett = new Scanner(System.in).nextLine();
// int lngth = lett.length();
// switch(lngth){
// case 1: System.out.println("Одна буква"); break;
// case 2: System.out.println("Две буквы"); break;
// case 3: System.out.println("Три буквы"); break;
// case 4: System.out.println("Четыре буквы"); break;
// case 5: System.out.println("Пять букв"); break;
// default: System.out.println("Длинное слово");
// }

// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// String greet = new Scanner(System.in).nextLine();
// System.out.println((greet.contains("Билл Гейтс") || greet.contains("Джефф
// Безос") || greet.contains("Илон Маск") || greet.contains("Марк Цукерберг")) ?
// "Добро пожаловать!" : "Здесь никого нет, Вы ошиблись дверью");
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// double x = sc.nextDouble(), y = sc.nextDouble();
// if( (x < 0 && x <= y && y <= (2 -(x * x))) || (x >= 0 && y >= 0 && y <= (2 -
// (x * x)))){
// System.out.println("Yes");
// } else{
// System.out.println("No");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int month = sc.nextInt();
// switch(month) {
// case 1: case 2: case 12:
// System.out.println("Зима");
// break;
// case 3: case 4: case 5:
// System.out.println("Весна");
// break;
// case 6: case 7: case 8:
// System.out.println("Лето");
// break;
// case 9: case 10: case 11:
// System.out.println("Осень");
// break;
// default:
// System.out.println("error");
// }
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// double a = sc.nextDouble(), b = sc.nextDouble();
// System.out.println((a == b) ? "=" : (a > b) ? ">" : "<" );
// }
// }

// import java.util.Scanner;

// class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = Math.abs(sc.nextInt()), b = Math.abs(sc.nextInt());
// if (a > 99 && a < 1000){
// if((a%100) / 10 == b){
// System.out.println("true");
// } else{
// System.out.println("false");
// }
// }else {
// System.out.println("error");
// }
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str1 = sc.nextLine().toLowerCase(), str2 =
// sc.nextLine().toLowerCase();
// System.out.println((str1.contains(str2)) ? "true" : "false");

// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println((a > 99 && a < 1000) ? "YES" : "NO");
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String comm = sc.nextLine();
// switch(comm){
// case "System.out.println()":
// System.out.println("Это команда вывода на печать");
// break;
// case "if":
// System.out.println("Это условный оператор");
// break;
// case "else":
// System.out.println("Это альтернативная конструкция условного оператора ");
// break;
// default:
// System.out.println("Раздел в разработке");
// }
// }
// }

// import java.util.Scanner;

// class Task {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();
// int min = Math.min(Math.min(a, b), c);
// int max = Math.max(Math.max(a, b), c);
// int n = (a+b+c)-min-max;
// if (max % 2 ==0) {
// System.out.println(max);
// } else if (n % 2==0) {
// System.out.println(n);
// } else if (min % 2==0) {
// System.out.println(min);
// } else System.out.println("Чётных чисел нет");
// }
// }
// правильное решение.

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max = 0;
// sc.close();
// if(a >= b | a >= c && a % 2 ==0){
// max = a;
// System.out.println(max);
// } else if (b >= max && b % 2 == 0) {
// max = b;
// System.out.println(max);
// } else if (c >= max && c % 2 == 0) {
// max = c;
// System.out.println(max);
// } else if( a % 2 != 0 && b % 2 != 0 && c % 2 != 0){
// System.out.println("Чётных чисел нет");
// }
// }
// } // не проходит тест с числами 12 10 16

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
// if(a-b > n || a-c > n || b-a > n || b-c > n || c-a > n || c-b > n){
// System.out.println("Ура, бастуем!");
// } else {
// System.out.println("За работу, Солнце ещё высоко");
// }
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), mid;
// if ((a >= b && a <=c) || (a <= b && a >= c)){
// mid = a;
// } else if ((b >= a && b <= c) || (b <= a && b >= c)){
// mid = b;
// } else{
// mid = c;
// }
// System.out.println(mid);
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String frst = sc.next(), scnd = sc.next(), thrd = sc.next();
// char f = frst.charAt(0), s = scnd.charAt(0), t = thrd.charAt(0);
// if ( (t < s) && (t < f) && (s < f)) {System.out.println(thrd + "\n" + scnd +
// "\n" + frst);}
// if ( (s < t) && (s < f) && (t < f)) {System.out.println(scnd + "\n" + thrd +
// "\n" + frst);}
// if ( (t < f) && (t < s) && (f < s)) {System.out.println(thrd + "\n" + frst +
// "\n" + scnd);}
// if ( (f < t) && (f < s) && (t < s)) {System.out.println(frst + "\n" + thrd +
// "\n" + scnd);}
// if ( (s < f) && (s < t) && (f < t)) {System.out.println(scnd + "\n" + frst +
// "\n" + thrd);}
// if ( (f < s) && (f < t) && (s < t)) {System.out.println(frst + "\n" + scnd +
// "\n" + thrd);}
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int day = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
// if ((day > 0 && day <= 31) && (month > 0 && month <= 12) && (year > 0)) {
// if((month == 4 || month == 6 || month == 9 || month == 11) && (day > 0 && day
// <= 30)){
// System.out.println("true");
// } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month ==
// 8 || month == 10 || month == 12) && (day > 0 && day <=31)){
// System.out.println("true");
// } else if (((month == 2) && (day ==28)) || ((year % 4 == 0 && year % 100 !=
// 0) || (year % 400 == 0))){
// System.out.println("true");
// } else{
// System.out.println("false");
// }
// } else {
// System.out.println("false");
// }
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
// System.out.println((((a + b + c) % 2 != 0) && ((a * b * c) % 2 == 0)) ?
// "true" : "false");
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc. nextInt();
// System.out.println(((a + b) % 2 == 0) && ((a * b) % 2 != 0) ? "true" :
// "false");
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine(), lett = sc.nextLine();
// System.out.println((str.contains(lett) || (str.length() > 20)) ? "YES" :
// "NO");
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println(((a % 7 == 0) && (a % 5 != 0)) ? "YES" : "NO");
// }
// }

// import java.util.Scanner;

// public class Task{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// sc.close();
// System.out.println(((x == 3) | (x == 4) |(x == 5)) ? "YES" : "NO");
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println((sc.nextDouble() < sc.nextDouble()) ? "Бой продолжается!"
// : "Холифилд - чемпион!");
// }
// }

// тернарный оператор:
// public class Task {
// public static void main(String[] args) {
// int x = 15;
// System.out.println((x % 2 == 0) ? "Число чётное" : "Число нечётное");
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max = a;
// sc.close();
// if(b > max){
// max = b;
// }
// if(c > max){
// max = c;
// }
// System.out.println(max);
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main (String[] args){
// Scanner sc = new Scanner(System.in);
// String pass_db = sc.nextLine(), pass_user = sc.nextLine();
// sc.close();
// if (pass_db.equals(pass_user)){
// System.out.println("Access is granted");
// } else {
// System.out.println("Access is denied");
// }
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String frst = sc.nextLine(), scnd = sc.nextLine();
// sc.close();
// if(frst.length() > scnd.length()) {
// System.out.println("Махатма");
// } else {
// System.out.println("Джавахарлал");
// }
// }
// }

// import java.util.Scanner;

// public class Task {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int year = sc.nextInt();
// System.out.println((year/4) - (year/100) + (year/400));
// }

// }
