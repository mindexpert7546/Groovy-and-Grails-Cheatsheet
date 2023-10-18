class FileIO {
    static main(args) {
        // Create a new File object for "input.txt" and read its lines.
        new File("input.txt").eachLine { line ->
            // For each line in the file, print the line with a "line : " prefix.
            println "line : $line"
        }
    }
}
