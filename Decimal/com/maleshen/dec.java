package come.maleshen;

public class dec extends str implements Comparable {
    private double val;

    public boolean CheckInput(String string) {
        try {
            Double.valueOf(string);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            this.chars.clear();
            return false;
        }
        return true;
    }

    public dec(double X) {
        this.val = X;
        for (int i = 0; i < String.valueOf((int)X).length(); i++)
            chars.add(String.valueOf((int)X).toCharArray()[i]);
    }

    public dec(String X) {
        if (CheckInput(X)) {
            this.val = Double.valueOf(X);
            for (int i = 0; i < X.length(); i++)
                chars.add(X.toCharArray()[i]);
        }
    }

    public dec(){}

    public void set(String X){
        if (CheckInput(X)) {
            this.val = Double.valueOf(X);
            for (int i = 0; i < X.length(); i++)
                chars.add(X.toCharArray()[i]);
        }
    }

    public void set(double X) {
        this.val = X;
        for (int i = 0; i < String.valueOf(X).length(); i++)
            chars.add(String.valueOf((int) X).toCharArray()[i]);
    }

    public dec raz(dec X){
        double r = this.val - X.val;
        return new dec(r);
    }

    public boolean IsBigger(dec X){
        return this.val > X.val;
    }

    public boolean IsSmaller(dec X){
        return this.val < X.val;
    }

    @Override
    public int compareTo(Object o) {
        if (this.val<((dec) o).val) return 1;
        else if (this.val>((dec) o).val) return -1;
        return 0;
    }
}
