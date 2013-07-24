/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.Date;
import negocio.Recarga;

/**
 *
 * @author Nanda
 */
public interface IRepositorioRecargas {
    public void inserir(Recarga recarga);
    public boolean existe(Recarga recarga);
    public void atualizar(Recarga recarga);
    public Recarga buscarPorId(int idRecarga);
    public ArrayList<Recarga> buscarPorCartao(int idCartao);
    public ArrayList<Recarga> buscarPorData(Date data);
}
