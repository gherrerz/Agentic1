#include <iostream>
#include <cmath>

using namespace std;

double calcularCuota(double monto, double tasa, int meses) {
    double tasaMensual = tasa / 12 / 100;
    return (monto * tasaMensual) / (1 - pow(1 + tasaMensual, -meses));
}

int main() {
    double monto;
    double tasa;
    int meses;

    cout << "Ingrese el monto del crédito: ";
    cin >> monto;
    cout << "Ingrese la tasa de interés anual (en %): ";
    cin >> tasa;
    cout << "Ingrese el número de meses: ";
    cin >> meses;

    double cuota = calcularCuota(monto, tasa, meses);
    cout << "La cuota mensual es: " << cuota << endl;

    return 0;
}