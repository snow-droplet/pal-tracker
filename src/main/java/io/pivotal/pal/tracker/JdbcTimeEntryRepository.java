package io.pivotal.pal.tracker;

import javax.sql.DataSource;
import java.sql.Time;
import java.util.List;

public class JdbcTimeEntryRepository implements TimeEntryRepository {

    private DataSource dataSource;

    public JdbcTimeEntryRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        return null;
    }

    @Override
    public TimeEntry find(long id) {
        return null;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
