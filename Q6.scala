object Q6{
    def main(args: Array[String]): Unit ={
        fibonacciSeq(10)
    }

    def fibonacci(num: Int): Int = num match{
        case x if(num == 0) => 0;
        case x if(num == 1) => 1;
        case _=> fibonacci(num -1) + fibonacci(num -2)
    }

    def fibonacciSeq(n:Int):Unit= {
        if (n > 0){
            fibonacciSeq(n-1);
        }    
        println(fibonacci(n))
    }



}