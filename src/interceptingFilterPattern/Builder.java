package interceptingFilterPattern;

public interface Builder {
    Builder setId(Integer id);
    Builder setUsername(String username);
    Builder setPassword(String password);

    Builder setRole(String role);
    User build();
}
