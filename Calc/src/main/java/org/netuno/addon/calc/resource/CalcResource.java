package org.netuno.addon.calc.resource;

import org.netuno.proteu.Proteu;
import org.netuno.tritao.hili.Hili;
import org.netuno.tritao.resource.Resource;
import org.netuno.tritao.resource.ResourceBase;

@Resource(name = "calc")
public class CalcResource extends ResourceBase {

    public double value = 0;

    public CalcResource(Proteu proteu, Hili hili) {
        super(proteu, hili);
    }

    public CalcResource init() {
        return new CalcResource(getProteu(), getHili());
    }

    public CalcResource set(double v) {
        value = v;
        return this;
    }

    public CalcResource plus(double v) {
        value += v;
        return this;
    }

    public CalcResource minus(double v) {
        value -= v;
        return this;
    }

    public double get() {
        return value;
    }
}
