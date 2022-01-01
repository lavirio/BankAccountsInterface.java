package Metro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubwayStation {
    private String stationName;
    private String lineId;

    List<String> connections = new ArrayList<>();


    public int connectionCount() {
        return connections.size();
    }

    @Override
    public String toString() {
        return "SubwayStation{" +
                "stationName=" + stationName +
                ", lineId=" + lineId  +
                ", connections=" + (connections.size() > 0 ? connections : "Нет перехода!")  +
                '}';
    }
}


