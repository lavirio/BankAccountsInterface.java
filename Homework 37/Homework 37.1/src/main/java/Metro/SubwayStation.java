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

    public SubwayStation(String stationName, String lineId) {
        this.stationName = stationName;
        this.lineId = lineId;
    }

    public void addConnections(String connection){
        if (!connections.contains(connection)) {
            connections.add(connection);
        }
    }

    public int connectionCount(){
        return connections.size();
    }
}


