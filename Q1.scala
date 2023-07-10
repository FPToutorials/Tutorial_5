object Q1{
    def main(args: Array[String]): Unit = {
        println(prime(5));
        println(prime(8));
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
}