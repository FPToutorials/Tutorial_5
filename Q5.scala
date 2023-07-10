object Q5{
    def main(args: Array[String]): Unit = {
        println(evenSum(10))
    }

    def detEvenOdd(num: Int): String = num match{
        case x if(num == 1) => "Odd";
        case x if(num == 0) => "Even";
        case _=> detEvenOdd(num - 2);
    }

    def evenSum(num:Int): Int = num match{
        case x if(num ==1) => 0;
        case x if(detEvenOdd(num) == "Even") => num + evenSum(num-1);
        case _=> 0 + evenSum(num-1);
    }
}