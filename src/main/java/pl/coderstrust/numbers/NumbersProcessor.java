package pl.coderstrust.numbers;

public class NumbersProcessor {
    public String processLine(String line) {

        String[] splittedLine = line.split("\\s+");
        StringBuilder newLine = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < splittedLine.length - 1; ++i) {
            newLine.append(splittedLine[i]);
            newLine.append(" + ");
            sum += Integer.parseInt(splittedLine[i]);
        }
        sum += Integer.parseInt(splittedLine[splittedLine.length - 1]);
        newLine.append(splittedLine[splittedLine.length - 1]);
        newLine.append(" = ");
        newLine.append(sum);


        //System.out.println(newLine.toString());


        return newLine.toString();
    }
}
