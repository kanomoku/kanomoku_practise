package java8;

interface A3_PersonFactory<P extends A3_Person> {
    P create(String firstName, String lastName);
}
