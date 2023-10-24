class FileIOS{
    static main(args) {
        new File("inputs.txt").eachLine{
            line -> println("line : $line");
        }
    }
}