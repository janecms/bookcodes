package interceptor;

import javax.sql.DataSource;

public interface DataSourceAware {
    void setDataSource(DataSource dataSource);
}
