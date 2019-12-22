import org.json.JSONArray;
import org.json.JSONObject;
import wrapper.IAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class Algorithm implements IAlgorithm {


    @Override
    public void Init(JSONObject args) {

    }

    @Override
    public JSONObject Start(JSONArray input) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("myAnswer", 33);
        data.put("mirror", input);
        return new JSONObject(data);
    }

    @Override
    public void Stop() {

    }

    @Override
    public void Cleanup() {

    }

    @Override
    public void StartSubPipeLine(String subPipeName, String id, Object message) {

    }

    @Override
    public void SubPipelineDone(String subId, Object data) {

    }
}
