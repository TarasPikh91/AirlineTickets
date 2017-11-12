<<<<<<< HEAD
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter count layers");
        int layers = scan.nextInt();
        System.out.println("enter count of radius");
        double radius = scan.nextDouble();
        if (layers >= 1 && layers <= 100 || radius >= 1 && radius <= 100) {
            double t = 2.0;
            double s = Math.pow(radius, t);
            double squar = s / layers;
            double radiusSmall = Math.sqrt(squar);
            System.out.println(radiusSmall);
        }
    }
}
=======
// package main;
//
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
//
// public class main {
//     public static void main(String args[]) throws FileNotFoundException {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter count layers");
//         int layers = scan.nextInt();
//         System.out.println("enter count of radius");
//         double radius = scan.nextDouble();
//         if (layers >= 1 && layers <= 100 || radius >= 1 && radius <= 100) {
//             double t = 2.0;
//             double s = Math.pow(radius, t);
//             double squar = s / layers;
//             double radiusSmall = Math.sqrt(squar);
//             System.out.println(radiusSmall);
//         }
//     }
// }
$(document).scroll(function() {
  if ($(document).width() > 785) {
    if ($(document).scrollTop() > $('#header').height() 100){
      $('#header').height();
    }
    else {
      $('#header').height() + 150;
    }
  }
});
>>>>>>> origin/prince
