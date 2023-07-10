object Q4{
    def main(args: Array[String]): Unit ={
        println(detEvenOdd(67));
    }

    def detEvenOdd(num: Int): String = num match{
        case x if(num == 1) => "Odd";
        case x if(num == 0) => "Even";
        case _=> detEvenOdd(num - 2);
    }
}