package interceptingFilterPattern;

import builderPattern.Person;

public class BuildUser implements interceptingFilterPattern.Builder {
    private Integer id;
    private String username;
    private String password;
    private String role;

    @Override
    public Builder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public Builder setUsername(String username) {
        this.username=username;
        return this;
    }

    @Override
    public Builder setPassword(String password) {
        this.password=password;
        return this;
    }

    @Override
    public Builder setRole(String role) {
        this.role=role;
        return this;
    }

    @Override
    public User build() {
        return new User(id,username,password,role);
    }
}
