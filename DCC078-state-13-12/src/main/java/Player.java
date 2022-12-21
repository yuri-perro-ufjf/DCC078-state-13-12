public class Player {
    private String name;
    private PlayerState state;

    public Player() {
        this.state = PlayerStateIdle.getInstance();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public boolean idle() {
        return state.idle(this);
    }

    public boolean work() {
        return state.work(this);
    }

    public boolean sleep() {
        return state.sleep(this);
    }

    public boolean eat() {
        return state.eat(this);
    }

    public boolean run() {
        return state.run(this);
    }

    public PlayerState getState() {
        return state;
    }

    public String getNameState() {
        return state.getState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
