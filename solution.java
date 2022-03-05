public class solution {

  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i >= 5; i -= 5) {
      System.out.print(i);
    }
  }

  void soln2() {
    // and put your code here.
    for (int i = 100; i <= 5; i -= 5) {
    }
  }

    void soln3 () {
      // Sum on  solutions
      int sum = 9;
      for (int i = 10; i <= 17; i++) {

      }
      System.out.print(sum);
    }

    void soln4 () {
      // and put your code here.
      int smallest = a[0];
      for (int x = 1; x < a.lenght; x++) {
        if (a[x] < smallest) ;
        smallest = a[x];
      }
      System.out.print(smallest);
    }

    void soln5 () {
      // and put your code here.
      int largest = a[0];
      for (int x = 1; x < a.lenght; x++) {
        if (a[x] < largest) ;
        largest = a[x];
      }
      System.out.print(largest);
    }

    void soln6 () {
      // and put your code here.
      for (int i = 0; i < a.length; i++) {
        if (a[i] == true) {
          break;
        }
        System.out.print(i);
      }
    }

      void soln7 () {
        // and put your code here.
        while (!a[i]) {
          i++;
        }
        System.out.print(i);
      }

      void soln8 () {
        // and put your code here.
        //for start at 0
        //middle section where it ends
        //last part i++ whats the next value of i going to be
        //i++ means i+1
        for (int i = 0; i < a.length; i++) {
          a[i] = a[i] + 5;
          System.out.print(a[i]);
        }
        // no need to print anything
      }

      void soln9 () {
        // and put your code here.
        //"each element" in array is great for For loops
        //if anything needs o print do it under for loop
        for (int i = 0; i < a.length; i++) {
          a[i] = a[i] / 1.3;
          System.out.print(a[i]);
        }
      }

      void soln10 () {
        // and put your code here.
        // "each element" in array is great for For loops
        for (int i = 0; i < a.length; i++) {
          double temp = a[i] * a[i] * a[i];
          a[i] = (temp - a[i]) / 3;
          System.out.print(a[i]);
        }
      }


      void soln11 () {
        // and put your code here.
        //there will 4 arrays and it will be 6 arrays in each 4
        //the 2nd for loop a[i] is for the end of the 1st array/inner array
        //J is top to bottom
        //A is left to right on chart
        //nested for loop
        for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
            a[i][j] = 0;
          }
        }

      }

      void soln12 () {
        // and put your code here.
        for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
            a[i][j] = a[i][j] * 7;
          }
        }
      }

      void soln13 () {
        // and put your code here.
        //  when array is even its true
        for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] % 2 = 0) {
              a[i][j] = true;

            } else {
              a[i][j] = false;
            }
          }
        }

      }

//in between () is the parameter
    double soln14 ( double a, double b){
      // and put your code here.

      return Math.pow(a,b);
    }

    boolean soln15 (Object fish) {
      // and put your code here.
      //after if statement paratehenseis have to be true or false
      if (fish ==Fish){
        return true;
      }
      //anything other than Fish it will return false
      return false;
    }

    void soln16 (Object x) {
      // and put your code here.
      double balance = x.Balance();
      if(balance <= 1.0){
        System.out.println("Paid Off");
      } else{
        //prints a decimal in a string
        String bal= String.format("%.2f",balance);
        System.out.println(bal);
      }
    }

    void soln17 () {
      // and put your code here.

    }

    void soln18 () {
      // and put your code here.
    }

    void soln19 () {
      // and put your code here.
    }

    void soln20 () {
      // and put your code here.
    }

    void soln21 () {
      // and put your code here.
    }

    void soln22 () {
      // and put your code here.
    }

  }

