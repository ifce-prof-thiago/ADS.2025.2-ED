#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

struct Lancamento {
    string categoria;
    string tipo; // despesa ou receita
    float valor;
};

float calcularJuros(const float valor) {
    float juros = valor * 0.10;
    return juros;
}

float calcularRendimentos(const float valor) {
    float rendimento = valor * 0.0125;
    return rendimento;
}

float calcularSaldo(const float saldoInicial, const vector<Lancamento> lancamentos) {
    float saldo = 0.0;
    for (auto lancamento: lancamentos) {
        if (lancamento.tipo == "receita") {
            saldo += lancamento.valor;
        } else {
            saldo -= lancamento.valor;
        }
    }
    saldo += saldoInicial;
    bool esta_negativada = saldo < 0;
    if (esta_negativada) {
        float juros = calcularJuros(saldo);
        saldo += juros;
    } else {
        float rendimento = calcularRendimentos(saldo);
        saldo += rendimento;
    }
    return saldo;
}

int main() {
    float saldo = 0.0;
    vector<Lancamento> lancamentosJan;
    lancamentosJan.push_back({"Salário", "receita", 1518.00});
    lancamentosJan.push_back({"Aluguel", "despesa", 700.00});
    saldo = calcularSaldo(saldo, lancamentosJan);
    printf("Saldo (Janeiro): %.2f\n", saldo);
}
