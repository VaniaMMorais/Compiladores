class Frac{

    Integer numerador, denominador;

    Frac(Integer n, Integer d){
        numerador = n;
        denominador = d;
    }

    Frac invert(){
        if(numerador<0)
            return new Frac(-denominador,- numerador);
        return new Frac(denominador, numerador);
    }

    Frac sum(Frac other){

        Frac result = new Frac(numerador, denominador);
        result.numerador*= other.denominador;
        other.numerador = result.denominador;

        result.denominador *= other.denominador;
        result.numerador += other.numerador;

        return result;
    }

    Frac sub(Frac other){
        Frac result = new Frac(numerador, denominador);

        result.numerador*= other.denominador;
        other.numerador = result.denominador;

        result.denominador *= other.denominador;
        result.numerador -= other.numerador;

        return result;
    }

    Frac mult(Frac other){
       return new Frac(numerador*other.numerador, denominador* other.denominador);
    }

    Frac div(Frac other){
        return mult(other.invert());
    }

    Frac power(Frac exp){

        Frac original= null;
        assert(exp.denominador == 1);

        try{
            original = (Frac) this.clone();
        }catch(Exception e){};

        
        for(; exp.numerador >1; exp.numerador--)
            mult(original);

        return this;
    }

    private Integer lcm(Integer a, Integer b){
        if(a<b) return lcm(b,a);
        for(int i=1;; i++){
            if(a*i%b==0)
                return a*i;
        }
    }

    Frac reduce(){
        Integer gcd;
        if (numerador==0){
            return this;
        }

        gcd = numerador*denominador;
        gcd /= lcm(numerador, denominador);
        
        return new Frac(numerador/gcd, denominador/gcd);
    }

    Frac minus(){
        numerador *= -1;
        return this;
    }

    void print(){
        System.out.printf("%d/%d\n", numerador, denominador);
    }
}