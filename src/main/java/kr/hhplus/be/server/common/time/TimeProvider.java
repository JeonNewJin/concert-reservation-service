package kr.hhplus.be.server.common.time;

import java.time.LocalDateTime;

public interface TimeProvider {

    LocalDateTime now();

}
