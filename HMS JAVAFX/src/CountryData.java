import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class CountryData {
    StringProperty f1= new SimpleStringProperty();
    StringProperty f2 = new SimpleStringProperty();
    StringProperty f3 = new SimpleStringProperty();
    StringProperty f4 = new SimpleStringProperty();
    StringProperty f5 = new SimpleStringProperty();
    StringProperty f6 = new SimpleStringProperty();
    StringProperty f7 = new SimpleStringProperty();
    StringProperty f8 = new SimpleStringProperty();
    StringProperty f9 = new SimpleStringProperty();
    StringProperty f10 = new SimpleStringProperty();
  
    public CountryData() {
		// TODO Auto-generated constructor stub
	}

	public final StringProperty c1() {
        return this.f1;
    }

    public final java.lang.String getCountry() {
        return this.c1().get();
    }

    public final void set1(final java.lang.String country) {
        this.c1().set(country);
    }

    public final StringProperty c2() {
        return this.f2;
    }

    public final java.lang.String getCapital() {
        return this.c2().get();
    }

    public final void set2(final java.lang.String capital) {
        this.c2().set(capital);
    }

    public final StringProperty c3() {
        return this.f3;
    }

    public final java.lang.String getPopulation() {
        return this.c3().get();
    }

    public final void set3(final java.lang.String population) {
        this.c3().set(population);
    }

    public final StringProperty c4() {
        return this.f4;
    }

    public final java.lang.String getDemocracy() {
        return this.c4().get();
    }

    public final void set4(final java.lang.String democracy) {
        this.c4().set(democracy);
    }

    public final void set5(final java.lang.String democracy) {
        this.c5().set(democracy);
    }


    public final void set6(final java.lang.String democracy) {
        this.c6().set(democracy);
    }

    public final void set7(final java.lang.String democracy) {
        this.c7().set(democracy);
    }

    public final void set8(final java.lang.String democracy) {
        this.c8().set(democracy);
    }
    public final void set9(final java.lang.String democracy) {
        this.c9().set(democracy);
    }
    public final void set10(final java.lang.String democracy) {
        this.c10().set(democracy);
    }
    
    public final StringProperty c5() {
        return this.f5;
    }
    
    public final StringProperty c6() {
        return this.f6;
    }
    
    public final StringProperty c7() {
        return this.f7;
    }
    
    public final StringProperty c8() {
        return this.f8;
    }
    
    public final StringProperty c9() {
        return this.f9;
    }
    public final StringProperty c10() {
        return this.f10;
    }    
    
    
    
    
    


}