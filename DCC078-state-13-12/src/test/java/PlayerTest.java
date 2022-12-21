import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    // Player idle

    @Test
    public void shouldNotBeSetIdlePlayer() {
        player.setState(PlayerStateIdle.getInstance());
        assertFalse(player.idle());
    }

    @Test
    public void shouldBeSetWorkIdlePlayer() {
        player.setState(PlayerStateIdle.getInstance());
        assertTrue(player.work());
        assertEquals(PlayerStateWork.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetSleepIdlePlayer() {
        player.setState(PlayerStateIdle.getInstance());
        assertTrue(player.sleep());
        assertEquals(PlayerStateSleep.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetEatIdlePlayer() {
        player.setState(PlayerStateIdle.getInstance());
        assertTrue(player.eat());
        assertEquals(PlayerStateEat.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetRunIdlePlayer() {
        player.setState(PlayerStateIdle.getInstance());
        assertTrue(player.run());
        assertEquals(PlayerStateRun.getInstance(), player.getState());
    }

    // Player Working

    @Test
    public void shouldBeSetIdleWorkingPlayer() {
        player.setState(PlayerStateWork.getInstance());
        assertTrue(player.idle());
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetEatWorkingPlayer() {
        player.setState(PlayerStateWork.getInstance());
        assertTrue(player.eat());
        assertEquals(PlayerStateEat.getInstance(), player.getState());
    }

    @Test
    public void shouldNotBeSetSleepWorkingPlayer() {
        player.setState(PlayerStateWork.getInstance());
        assertFalse(player.sleep());
    }

    @Test
    public void shouldNotBeSetRunWorkingPlayer() {
        player.setState(PlayerStateWork.getInstance());
        assertFalse(player.run());
    }

    @Test
    public void shouldNotBeSetWorkWorkingPlayer() {
        player.setState(PlayerStateWork.getInstance());
        assertFalse(player.work());
    }

    // Player Sleeping

    @Test
    public void shouldNotBeSetSleepSleepingPlayer() {
        player.setState(PlayerStateSleep.getInstance());
        assertFalse(player.sleep());
    }

    @Test
    public void shouldBeSetIdleSleepingPlayer() {
        player.setState(PlayerStateSleep.getInstance());
        assertTrue(player.idle());
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }

    @Test
    public void shouldNotBeSetWorkSleepingPlayer() {
        player.setState(PlayerStateSleep.getInstance());
        assertFalse(player.work());
    }

    @Test
    public void shouldNotBeSetEatSleepingPlayer() {
        player.setState(PlayerStateSleep.getInstance());
        assertFalse(player.eat());
    }

    @Test
    public void shouldNotBeSetRunSleepingPlayer() {
        player.setState(PlayerStateSleep.getInstance());
        assertFalse(player.run());
    }

    // Player Eating

    @Test
    public void shouldNotBeSetEatEatingPlayer() {
        player.setState(PlayerStateEat.getInstance());
        assertFalse(player.eat());
    }

    @Test
    public void shouldNotBeSetSleepEatingPlayer() {
        player.setState(PlayerStateEat.getInstance());
        assertFalse(player.sleep());
    }

    @Test
    public void shouldBeSetIdleEatingPlayer() {
        player.setState(PlayerStateEat.getInstance());
        assertTrue(player.idle());
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetWorkEatingPlayer() {
        player.setState(PlayerStateEat.getInstance());
        assertTrue(player.work());
        assertEquals(PlayerStateWork.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetRunEatingPlayer() {
        player.setState(PlayerStateEat.getInstance());
        assertTrue(player.run());
        assertEquals(PlayerStateRun.getInstance(), player.getState());
    }

    // Player Running

    @Test
    public void shouldNotBeSetRunRunningPlayer() {
        player.setState(PlayerStateRun.getInstance());
        assertFalse(player.run());
    }

    @Test
    public void shouldNotBeSetSleepRunningPlayer() {
        player.setState(PlayerStateRun.getInstance());
        assertFalse(player.sleep());
    }

    @Test
    public void shouldNotBeSetWorkRunningPlayer() {
        player.setState(PlayerStateRun.getInstance());
        assertFalse(player.work());
    }

    @Test
    public void shouldBeSetEatRunningPlayer() {
        player.setState(PlayerStateRun.getInstance());
        assertTrue(player.eat());
        assertEquals(PlayerStateEat.getInstance(), player.getState());
    }

    @Test
    public void shouldBeSetIdleRunningPlayer() {
        player.setState(PlayerStateRun.getInstance());
        assertTrue(player.idle());
        assertEquals(PlayerStateIdle.getInstance(), player.getState());
    }
}