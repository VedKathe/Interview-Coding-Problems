package Pattern;

class StarPattern{

    void pattern1(int n){
        /*
            *
            * *
            * * *
            * * * *
        */       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void pattern2(int n){
        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        */       
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void pattern3(int n){
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
        */       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void pattern4(int n){
        /*
            *
              *
                *
                  *
                    *
                  *
                *
              *
            *
        */       
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = n-2; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }
}