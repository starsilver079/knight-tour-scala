// class Test {
//     def generate(msg : List[Char]) = {
//         msg.foreach{case(c) => print ('+'.toString() * c.toInt + '.' + """[-]""")}
//     }
// }

object Demo {
    def generate(msg : List[Char]) = {
        msg.foreach{case(c) => print ('+'.toString() * c.toInt + '.' + """[-]""")}
    }

    def main(args: Array[String]) = {
        generate(List('A', 'B', 'C'))
    }
}
