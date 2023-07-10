object Q2{
    def main(args: Array[String]): Unit ={
        primeSeq(10);
    }

    def gcd(a:Int, b:Int):Int = b match{
        case x if (b == 0) => a;
        case x if (b > a) => gcd(b,a);
        case _ => gcd(b,a%b); 
    } 

    def prime(p:Int, n:Int = 2): Boolean = n match{
        case x if(p == n) => true;
        case x if(gcd(p, n) > 1) => false;
        case _=> prime(p, n+1);
    }

    def primeSeq(num:Int): Any = num match{
        case x if(num == 1) => println(num);
        case x if(num > 1 && prime(num)) => println(num); primeSeq(num -1);
        case _=> primeSeq(num-1); 
    }
}