package learning.vladdubceac.iterator;

public class Arts implements Subject {
    private String[] subjects;

    public Arts() {
        this.subjects = new String[]{};
    }

    public Arts(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(this.subjects);
    }

    class ArtsIterator implements Iterator {
        private String[] artsArray;
        private int pos;

        public ArtsIterator(String[] artsArray) {
            this.artsArray = artsArray;
            pos = 0;
        }

        @Override
        public void first() {
            pos = 0;
        }

        @Override
        public String next() {
            if (artsArray != null && artsArray.length > 0) {
                if (pos <= artsArray.length - 1) {
                    return artsArray[pos++];
                }
            }
            return null;
        }

        @Override
        public boolean isDone() {
            return artsArray != null && artsArray.length > 0 && pos >= artsArray.length;
        }

        @Override
        public String currentItem() {
            if (artsArray != null && artsArray.length > 0 ) {
                if(pos == artsArray.length){
                    return artsArray[pos-1];
                }else {
                    return artsArray[pos];
                }
            }
            return null;
        }
    }
}
