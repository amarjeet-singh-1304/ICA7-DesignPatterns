package syl.gen;

public class FacadeClass implements Facade{
    @Override
    public void Builder() {
        Builder builder1 = new Builder();
        builder1.setCourseName();
    }

    @Override
    public void Prof() {
        System.out.println("Call has been made to Adapter Pattern");
        SyncTimer syncTimer1 = new SyncTimer();
        syncTimer1.getSyncTime();
    }

    @Override
    public void Create() {
        SyllabusDecorator syllabusDecorator = new SyllabusDecorator();
        syllabusDecorator.createsyllabus();

    }

    @Override
    public void SyncTimerInterface() {

    }
}
