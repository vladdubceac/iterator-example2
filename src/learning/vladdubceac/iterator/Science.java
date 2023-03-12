package learning.vladdubceac.iterator;

import java.util.LinkedList;

public class Science implements Subject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
    }

    public Science(LinkedList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(this.subjects);
    }

    class ScienceIterator implements Iterator {
        int pos;
        private LinkedList<String> scienceList;

        public ScienceIterator(LinkedList<String> scienceList) {
            this.scienceList = scienceList;
            pos = 0;
        }

        @Override
        public void first() {
            pos = 0;
        }

        @Override
        public String next() {
            if (scienceList != null && !scienceList.isEmpty()) {
                if (pos <= scienceList.size() - 1) {
                    return scienceList.get(pos++);
                }
            }
            return null;
        }

        @Override
        public boolean isDone() {
            return scienceList != null && !scienceList.isEmpty() && pos >= scienceList.size();
        }

        @Override
        public String currentItem() {
            if (scienceList != null && !scienceList.isEmpty()) {
                if (pos == scienceList.size()) {
                    return scienceList.get(pos - 1);
                } else {
                    return scienceList.get(pos);
                }
            } else {
                return null;
            }
        }
    }
}
