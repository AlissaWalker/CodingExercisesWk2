public class solution {

  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i >= 5; i -= 5) {
      System.out.print(i);
    }
  }

  void soln2() {
    // and put your code here.
    for (int i = 100; i >= 5; i -= 5) {
    }
  }

    void soln3 () {
      // Sum on  solutions
      int sum = 0;
      for (int i = 9; i <= 17; i++) {
        sum= sum + i;
      }
      System.out.print(sum);
    }

    void soln4 () {
      // and put your code here.
      int smallest = a[0];
      for (int x = 1; x < a.length; x++) {
        if (a[x] < smallest) ;
        smallest = a[x];
      }
      System.out.print(smallest);
    }

    void soln5 () {
      // and put your code here.
      int largest = a[0];
      for (int x = 1; x < a.length; x++) {
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
  //a while loop that turns on heat
      //thermo.getTemp is a class we have to create
      String hvac=""; //

      while(thermo.getTemp()< 72.0){    //class is red because theres no thermo class
          hvac= " HeaterOn";
      }
      if(thermo.getTemp()> 76.0){   //do if down here because everthing in while has to be true
        hvac ="AC On";
      }
    }

    void soln18 () {
      // and put your code here.
      //value is array's name
      double [] values = {0.0,3.14}; //need {}  to instantiate array

        for(int i=0; i< values.length; i++) {
            if(value[i]> Math.PI ){
              System.out.println(values[i]); //this prints the value of index prints # @ index
              System.out.println(i); // this prints index
            }
          //after loops check for # being greater than pi
          //Math.PI ---> the # pi
        }

    }

    void soln19 ( Object [] objects ) {
      // and put your code here.
      Integer sum = 0;  //Integer has to be capital
      for(int i =0;i< objects.length; i++){
        Integer value= Xaction.getValue(objects[i]); // sent the value to an int and calls it from the XAction class
        if(value != null){ //if the value doesnt = null
          sum += value; //sum = sum + value
        }

      }
     System.out.println(sum);  //prints sum
    }

    void soln20 () {
      // and put your code here.
      // 1 for loop
    }

    void soln21 () {
      // and put your code here.
    }

    void soln22 () {
      // and put your code here.
    }

  }

