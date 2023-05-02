module.exports = {
  css: {
    loaderOptions: {
        less: {
          javascriptEnabled: true,
          modifyVars: {
            'primary-color': '#1E90FF',
            'link-color': '#E14C45',
          },
        },
    },
  },

  // outputDir:"settlement-server-front",
 
  devServer: {
    port: 3000,
  },
};