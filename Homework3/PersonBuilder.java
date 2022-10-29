import java.util.Date;

public class PersonBuilder {
    private String firstname;
    private String lastname;
    private String patronymic;
    private String birthdate;
    private String phonenumber;
    private String sex;

    public PersonBuilder() {
        super();
    }

    public PersonBuilder setFirstname(String  fn) {
        this.firstname = fn;
        return this;
    }

    public PersonBuilder setLastname(String  ln) {
        this.lastname = ln;
        return this;
    }

    public PersonBuilder setBirthDate(String  bd) {
        this.birthdate = bd;
        return this;
    }

    public PersonBuilder setPhonenumber(String  pn) {
        this.phonenumber = pn;
        return this;
    }

    public PersonBuilder setPatronymic(String  pt) {
        this.patronymic = pt;
        return this;
    }

    public PersonBuilder setSex(String  s) {
        this.sex = s;
        return this;
    }

    public Person createPerson() {
        Person person = new Person(firstname, lastname, patronymic, birthdate, phonenumber, sex);
        if (person.doQualityCheck()) {
            return person;
        } else {
            return null;
        }
    }

    // public Date checkDate(String maybeDate, String format, boolean lenient) {
    //     Date date = null;
    //     String reFormat = Pattern.compile("d+|M+").matcher(Matcher.quoteReplacement(format)).replaceAll("\\\\d{1,2}");
    //     reFormat = Pattern.compile("y+").matcher(reFormat).replaceAll("\\\\d{4}");
    //     if (Pattern.compile(reFormat).matcher(maybeDate).matches()) {
    //         SimpleDateFormat sdf = (SimpleDateFormat) DateFormat.getDateInstance();
    //         sdf.applyPattern(format);
    //         sdf.setLenient(lenient);
    //         try { date = (Date) sdf.parse(maybeDate); } catch (ParseException e) 
    //         { 
    //             throw new ParseException("Вы ввели дату рождения в неверном формате ");
    //         }
    //       } 
    //       return date;
    // }
}
