package Task_22;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Computer {
    private List<Characteristics> list;

    public Computer() {
        this.list = new LinkedList<>();

    }
    public void printInfo(){
        System.out.println(list);
    }
    public void getInfo(Characteristics characteristics){
        if (! list.contains(characteristics)){
            list.add(characteristics);
        }
    }

    protected class Characteristics{
        private String OS;
        private String CPU;
        private String RAM;

        public Characteristics(String OS, String CPU, String RAM) {
            this.OS = OS;
            this.CPU = CPU;
            this.RAM = RAM;
        }

        @Override
        public String toString() {
            return "Characteristics{" +
                    "OS='" + OS + '\'' +
                    ", CPU='" + CPU + '\'' +
                    ", RAM='" + RAM + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Characteristics that = (Characteristics) o;
            return Objects.equals(OS, that.OS) &&
                    Objects.equals(CPU, that.CPU) &&
                    Objects.equals(RAM, that.RAM);
        }

        @Override
        public int hashCode() {
            return Objects.hash(OS, CPU, RAM);
        }
    }
}
