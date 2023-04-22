package Veiculo.Passeio;

import Veiculo.BDVeiculos;
import exception.VelocidadeException;

import javax.swing.*;

public class CadastroPasseio extends javax.swing.JFrame {

    private static CadastroPasseio cadPassUnico;

    public CadastroPasseio() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctPassageiros = new javax.swing.JTextField();
        lblPassageiros = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        ctPlaca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        ctMarca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        ctModelo = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        ctCor = new javax.swing.JTextField();
        lblRodas = new javax.swing.JLabel();
        ctRodas = new javax.swing.JTextField();
        lblVelcMax = new javax.swing.JLabel();
        ctVelocMax = new javax.swing.JTextField();
        lblPistoes = new javax.swing.JLabel();
        ctPistoes = new javax.swing.JTextField();
        lblPotencia = new javax.swing.JLabel();
        ctPotencia = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpa = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Ve�culos de Veiculo.Passeio");

        ctPassageiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPassageirosActionPerformed(evt);
            }
        });

        lblPassageiros.setText("Qtd. Passageiros");

        lblPlaca.setText("Placa");

        ctPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPlacaActionPerformed(evt);
            }
        });

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        lblRodas.setText("Qtd. Rodas");

        lblVelcMax.setText("Velocidade M�xima");

        ctVelocMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctVelocMaxActionPerformed(evt);
            }
        });

        lblPistoes.setText("Qtd. Pist�es");

        ctPistoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPistoesActionPerformed(evt);
            }
        });

        lblPotencia.setText("Pot�ncia");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpa.setText("Limpar");
        btLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblVelcMax)
                                                                        .addComponent(lblPistoes)
                                                                        .addComponent(lblPotencia))
                                                                .addGap(49, 49, 49)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ctVelocMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                                                        .addComponent(ctPistoes, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ctPotencia, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblPlaca)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblPassageiros)
                                                                        .addComponent(lblMarca)
                                                                        .addComponent(lblModelo)
                                                                        .addComponent(lblCor)
                                                                        .addComponent(lblRodas))
                                                                .addGap(59, 59, 59)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ctMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ctPlaca)
                                                                        .addComponent(ctModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ctCor)
                                                                        .addComponent(ctRodas, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ctPassageiros))))
                                                .addGap(136, 136, 136))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassageiros))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPlaca)
                                        .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMarca)
                                        .addComponent(ctMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblModelo)
                                        .addComponent(ctModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCor)
                                        .addComponent(ctCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRodas))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblVelcMax)
                                        .addComponent(ctVelocMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPistoes)
                                        .addComponent(ctPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPotencia)
                                        .addComponent(ctPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(btSair)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctPassageirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPassageirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPassageirosActionPerformed

    private void ctPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPlacaActionPerformed

    private void ctVelocMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctVelocMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctVelocMaxActionPerformed

    private void ctPistoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPistoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPistoesActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaActionPerformed
        limpar();
    }//GEN-LAST:event_btLimpaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public static CadastroPasseio getCadPasseio() {
        if (cadPassUnico == null) {
            cadPassUnico = new CadastroPasseio();
        }
        return cadPassUnico;
    }

    public void limpar() {
        ctPassageiros.setText("");
        ctPlaca.setText("");
        ctMarca.setText("");
        ctModelo.setText("");
        ctCor.setText("");
        ctRodas.setText("");
        ctVelocMax.setText("");
        ctVelocMax.setText("");
        ctPistoes.setText("");
        ctPotencia.setText("");
        ctPassageiros.requestFocus();
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
        limpar();
    }

    public void cadastrar() {
        Passeio passeio = new Passeio();
        try {
            passeio.setModelo(ctModelo.getText());
            passeio.setCor(ctCor.getText());
            passeio.setMarca(ctCor.getText());
            passeio.setQuantidadePassageiros(Integer.parseInt(ctPassageiros.getText()));
            passeio.setQuantidadeRodas(Integer.parseInt(ctRodas.getText()));
            passeio.setPlaca(Integer.parseInt(ctPlaca.getText()));
            passeio.getMotor().setQuantidadePistao(Integer.parseInt(ctPistoes.getText()));
            passeio.getMotor().setPontencia(Integer.parseInt(ctPotencia.getText()));
            passeio.setVelocidadeMax(Integer.parseInt(ctVelocMax.getText()));

            BDVeiculos.cadastroPasseio(passeio);

            if (passeio != null) {
                JOptionPane.showMessageDialog(null, "Veiculo.Passeio cadastrado com sucesso! ", "Cadastro ok", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "J� existe um ve�culo com est� placa! ", "Cadastro n�o realizado", 0);
                ctPlaca.setText("");
                ctPlaca.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos do cadastro! ", "Erro", JOptionPane.ERROR_MESSAGE);
            limpar();
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "Erro inesperado tente novamente! ", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (VelocidadeException e) {
            e.erroVelococidade();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpa;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCor;
    private javax.swing.JTextField ctMarca;
    private javax.swing.JTextField ctModelo;
    private javax.swing.JTextField ctPassageiros;
    private javax.swing.JTextField ctPistoes;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JTextField ctPotencia;
    private javax.swing.JTextField ctRodas;
    private javax.swing.JTextField ctVelocMax;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPassageiros;
    private javax.swing.JLabel lblPistoes;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblRodas;
    private javax.swing.JLabel lblVelcMax;
    // End of variables declaration//GEN-END:variables

}