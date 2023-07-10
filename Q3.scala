object Q3{
    def main(args: Array[String]): Unit ={
        println(sum(5));
    }

    def sum(num:Int): Int = num match{
        case x if(num == 1) => num;
        case _=> num + sum(num -1);
    }
}