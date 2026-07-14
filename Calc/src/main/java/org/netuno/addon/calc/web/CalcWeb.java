package org.netuno.addon.calc.web;

import org.netuno.proteu.Path;
import org.netuno.proteu.ProteuException;
import org.netuno.tritao.Web;
import org.netuno.tritao.resource.Out;
import org.netuno.tritao.resource.Req;
import org.netuno.tritao.resource.Val;

import java.io.IOException;

@Path("/addon/calc/Calc")
public class CalcWeb extends Web {

    public void run() throws IOException, ProteuException {
        Req req = resource(Req.class);
        Out out = resource(Out.class);
        Val val = resource(Val.class);

        String op = req.getString("op", "plus");
        double x = req.getDouble("x", 0);
        double y = req.getDouble("y", 0);

        double result = 0;

        if (op.equalsIgnoreCase("minus")) {
            result = x - y;
        } else {
            result = x + y;
        }

        out.json(val.map().set("result", result));
    }
}
